import cv2 as cv
import numpy as np

cap = cv.VideoCapture('movingball.mp4')

while(1):
    # Take each frame
    _, frame = cap.read()

    # Convert BGR to HSV
    hsv = cv.cvtColor(frame, cv.COLOR_BGR2HSV)

    # define range of red color in HSV

    # lower mask (0-10)
    lower_red = np.array([0,50,50])
    upper_red = np.array([10,255,255])
    mask0 = cv.inRange(hsv, lower_red, upper_red)

    # upper mask (170-180)
    lower_red = np.array([170,50,50])
    upper_red = np.array([180,255,255])
    mask1 = cv.inRange(hsv, lower_red, upper_red)

    # join my masks
    mask = mask0+mask1

    #opening and closing
    kernel = np.ones((40,40),np.uint8)
    opening = cv.morphologyEx(mask, cv.MORPH_OPEN, kernel)
    closing = cv.morphologyEx(mask, cv.MORPH_CLOSE, kernel)

    mask = opening + closing
    # Threshold the HSV image to get only red colors
    #mask = cv.inRange(hsv, lower_red, upper_red)

    # Bitwise-AND mask and original image
    res = cv.bitwise_and(frame,frame, mask= mask)
    cv.imshow('frame',frame)
    cv.imshow('mask',mask)
    cv.imshow('res',res)


    # convert image to grayscale image
    gray_image = cv.cvtColor(res, cv.COLOR_BGR2GRAY)

    # convert the grayscale image to binary image
    ret,thresh = cv.threshold(gray_image,127,255,0)

    # calculate moments of binary image
    M = cv.moments(thresh)

    # calculate x,y coordinate of center
    cX = int(M["m10"] / M["m00"])
    cY = int(M["m01"] / M["m00"])

    # put text and highlight the center
    cv.circle(frame, (cX, cY), 5, (255, 255, 255), -1)
    #cv.putText(frame, "centre", (cX - 25, cY - 25),cv.FONT_HERSHEY_SIMPLEX, 0.5, (255, 255, 255), 2)

    # display the image
    cv.imshow("Image", frame)





    k = cv.waitKey(5) & 0xFF
    if k == 27:
        break
cv.destroyAllWindows()
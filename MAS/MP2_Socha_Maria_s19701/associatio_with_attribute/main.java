package MAS.MP2_Socha_Maria_s19701.associatio_with_attribute;

public class main {
    public static void main(String[] args) {

        Artist picasso = new Artist("Pablo Picasso");

        Style cubism = new Style("Cubism");
        Style expressionism = new Style("Expressionism");

        //the painting class connects the artist and the style class
        //an artist can have paintings in multiple styles
        //and a style can be used by multiple artists
        Painting weapinWoman = new Painting("The Weaping Woman", cubism, picasso);
        Painting laReve = new Painting("La Rêve", cubism, picasso);
        Painting demoiselles = new Painting("Led Demoiselles d'Avignon", cubism, picasso);

        Painting theOldGuitarist = new Painting("The Old Guitarist", expressionism, picasso);

        //printing an artist gives us his name and all paintings created by him or hear
        System.out.println(picasso);

        //printing a style gives us its name and the the paintings created in it
        System.out.println(cubism);
        System.out.println(expressionism);

        //printing a painting gives us its title, author and style
        System.out.println(weapinWoman);
        System.out.println(laReve);
        System.out.println(demoiselles);
        System.out.println(theOldGuitarist);

    }
}

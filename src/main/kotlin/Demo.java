public class Demo {
    public static void main(String[] args) {
        Scientist gaia = Scientist.Companion.newScientist("Gaia", "Emmy");
        Scientist el = Scientist.Companion.newScientist("El", "Cado");
        Scientist wadi = Scientist.Companion.newScientist("Wadi", "Template");
        System.out.println(gaia.getFullName());
        System.out.println(el.getFullName());
        System.out.println(wadi.getFullName());

        ScientistRepository.INSTANCE.addScientist(gaia);
        ScientistRepository.INSTANCE.addScientist(el);
        ScientistRepository.INSTANCE.addScientist(wadi);
        ScientistRepository.INSTANCE.listAllScientists();


    }
}

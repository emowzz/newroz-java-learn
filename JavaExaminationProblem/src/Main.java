public class Main {
    public static void main(String[] args) {
        Human neurologist = new Doctor();
        Human cs1 = new CSEngineer();
        Human civil1 = new CivilEngineer();
//        Engineer cs2 = new CSEngineer();
//        Engineer civil2 = new CivilEngineer();
//
        neurologist.study();
        cs1.study();
        civil1.study();
//        cs2.study();
//        civil2.study();

        System.out.println();

        neurologist.work();
        cs1.work();
        civil1.work();
//        cs2.work();
//        civil2.work();

    }
}

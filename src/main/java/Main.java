public class Main {
    public static void main(String[] args) {
        Student manni = new Student();
        manni.setName("Manfred Muster");
        manni.setAge(33);
        manni.setMatrikelNr(4710);
        System.out.println("Dies ist "+manni.getName() + " " +manni.getAge() + " seine Mat Nr:" + manni.getMatrikelNr());
    }
}

public class ScavengerHunt {
    String soal, kunci;
    ScavengerHunt next;

    ScavengerHunt() {

    }

    ScavengerHunt(String soal, String kunci, ScavengerHunt next) {
        this.soal = soal;
        this.kunci = kunci;
        this.next = next;
    }
}

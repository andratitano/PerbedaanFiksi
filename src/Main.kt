fun main(args: Array<String>){
    start()
}

fun start() {
    println("Hai, pengin tahu perbedaan karya fiksi antara cerpen dan novel?")
    println("Aku bakal kasih 1 judul dari masing-masing jenis karya sastranya nih.")
    println("Coba ketika 'mau' dan akan kutunjukkan perbedaannya!")
    mau()
}

fun mau() {
    print("> ")
    when(readLine()) {
        "mau" -> tulisanPerbandingan()
    }
}

fun tulisanPerbandingan() {
    val cerpen: Cerpen = Cerpen()
    val novel: Novel = Novel()
    println("Apa aja sih perbedaan novel dan cerpen? Check it out.")
    println("Bedanya ${cerpen.nama} dan ${novel.name} aku jabarin di bawah ya.")
    println("Cerpen")
    cerpen.definisi()
    cerpen.jumlahKata()
    cerpen.alurCerita()
    cerpen.tokohUtama()
    println("Novel")
    novel.definisi()
    novel.jumlahKata()
    novel.alurCerita()
    novel.tokohUtama()

}

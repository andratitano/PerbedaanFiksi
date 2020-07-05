class Cerpen(): CiriFiksi {
    var nama: String = "Cerpen"

    override fun definisi() {
        println("${this.nama}  adalah prosa yang menceritakan sebagian kecil dari kehidupan pelakunya yang terpenting dan paling menarik. Di dalam cerpen boleh ada konflik atau pertikaian, akan tetapi hal itu tidak menyebabkan perubahan nasib pelakunya. ")
    }


    fun jumlahKata() {
        println("${this.nama}jumlah katanya 4.000-10.000")
    }

    fun alurCerita() {
        println("${this.nama} memiliki alur cerita singkat dan sederhana.")
    }

    fun tokohUtama() {
        println("${this.nama} Berfokus hanya pada satu tokoh utama dan satu peristiwa saja.")
    }
}

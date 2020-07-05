class Novel(): CiriFiksi {
    var name: String = "Novel"

    override fun definisi() {
        println("${this.name}  Novel adalah bentuk prosa baru yang melukiskan sebagian kehidupan pelaku utamanya yang terpenting, paling menarik, dan yang mengandung konflik. Konflik atau pergulatan jiwa tersebut mengakibatkan perubahan nasib pelaku. ")
    }


    fun jumlahKata() {
        println("${this.name} jumlah katanya 35.000-50.000")
    }

    fun alurCerita() {
        println("${this.name} memiliki alur cerita panjang dan kompleks. Terkadang memiliki alur sampingan yang tidak berhubungan dengan konflik utama cerita")
    }

    fun tokohUtama() {
        println("pada ${this.name}, tokoh utamanya bisa lebih dari satu. Dan menceritakan tidak hanya berpusat dalam satu tokoh, di mana setiap tokoh mempunyai deskripsi watak dan karakter yang cukup rinci.")
    }
}

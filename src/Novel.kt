class Novel(): CiriFiksi {
    var name: String = "Novel"

    override fun definisi() {
        println("${this.name}  Novel adalah bentuk prosa baru yang melukiskan sebagian kehidupan pelaku utamanya yang terpenting, paling menarik, dan yang mengandung konflik. Konflik atau pergulatan jiwa tersebut mengakibatkan perubahan nasib pelaku. ")
    }


    fun jumlahKata() {
        println("${this.name}'s real name is ${this.name}")
    }

    fun alurCerita() {
        println("${this.name} is categorized as an Animal. ${this.name} inherits from HomoSapien and HomoSapien is from Animal.")
    }

    fun tokohUtama() {
        println("${this.name} can leap building with only one blow. He is ${this.name}.")
    }
}

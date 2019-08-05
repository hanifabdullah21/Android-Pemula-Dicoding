package com.singpaulee.submission_android_pemula_dicoding.helper

import com.singpaulee.submission_android_pemula_dicoding.model.DinosaurModel

object DinosaurBank {

    private var dinosaurTriassic = arrayOf(
        arrayOf(
            "Isanosaurus",
            "https://images.dinosaurpictures.org/Isanosaurus_by_jorgearagon_b956.jpg",
            "Isanosaurus adalah herbivora. Ia hidup di zaman Trias dan mendiami Asia. Fosilnya telah ditemukan di tempat-tempat seperti Provinsi Phetchabun (Thailand).",
            "- Ada dari Zaman Norian ke Zaman Rhaetian\n" +
                    "- Tinggal di habitat darat\n" +
                    "- Apakah seorang herbivora\n" +
                    "- Diproduksi ulang dengan bertelur\n" +
                    "- Memiliki massa tubuh sekitar 346.2085 g\n" +
                    "- Tulang paha fosil memiliki panjang sekitar 760 mm dan lebar 71,5 mm\n" +
                    "- Hanya satu spesimen yang ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Alexeyisaurus",
            "https://images.dinosaurpictures.org/alexeyisaurus_ca72.jpg",
            "Alexeyisaurus adalah seorang plesiosaurus, sejenis reptil laut. Itu bukan dinosaurus, meskipun hidup berdampingan dengan banyak dinosaurus. Alexeyisaurus hidup selama Trias Akhir dan tinggal di Eropa. Fosil Alexeyisaurus pertama ditemukan pada 2010.\n" +
                    "\n" +
                    "Tidak banyak yang diketahui tentang penemuan baru-baru ini dari Arktik jauh di utara Rusia. Itu adalah plesiosaurus, atau dinosaurus laut, kemungkinan besar berasal dari jura pertengahan. Seperti paus yang datang jauh setelah mereka, plesiosaurus diturunkan dari penghuni darat berkaki empat yang hidup di lautan.",
            "- Ada dari Zaman Norian hingga 208,5 juta tahun yang lalu\n" +
                    "- Tinggal di habitat laut\n" +
                    "- Apakah karnivora\n" +
                    "- Direproduksi oleh kelahiran hidup\n" +
                    "- Hanya satu spesimen yang ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Liliensternus",
            "https://images.dinosaurpictures.org/Liliensternus2_0d25.jpg",
            "Liliensternus adalah karnivora. Ia hidup pada zaman Trias dan mendiami Eropa. Fosilnya telah ditemukan di tempat-tempat seperti Thuringia (Jerman), Free State of Bavaria (Jerman) dan Luzern (Swiss).",
            "- Sudah ada dari 228 juta tahun lalu hingga 201,3 juta tahun lalu\n" +
                    "- Tinggal di habitat darat\n" +
                    "- Apakah karnivora\n" +
                    "- Diproduksi ulang dengan bertelur\n" +
                    "- 5 spesimen berbeda telah ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Euskelosaurus",
            "https://images.dinosaurpictures.org/C0108426-Euskelosaurus_prosauropod_dinosaur-SPL_3ed0.jpg",
            "Euskelosaurus was a herbivore. It lived in the Triassic period and inhabited Africa. Its fossils have been found in places such as Free State (RSA), Central District (Botswana) and Mohale's Hoek (Lesotho).",
            ""
        ),
        arrayOf(
            "Chindesaurus",
            "https://images.dinosaurpictures.org/Chindesaurus-nhm.ac.uk__3651.jpg",
            "Chindesaurus adalah karnivora. Ia hidup pada zaman Trias dan mendiami Amerika Utara. Fosilnya telah ditemukan di tempat-tempat seperti New Mexico dan Texas.",
            "- Sudah ada dari 228 juta tahun lalu menjadi 208,5 juta tahun lalu\n" +
                    "- Tinggal di habitat darat\n" +
                    "- Apakah karnivora\n" +
                    "- Diproduksi ulang dengan bertelur\n" +
                    "- 7 spesimen berbeda telah ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Eudimorphodon",
            "https://images.dinosaurpictures.org/eudimorphodon_0cd6.jpg",
            "Eudimorphodon adalah pterosaurus, sejenis reptil terbang. Itu bukan dinosaurus, meskipun hidup pada periode yang sama. Eudimorphodon hidup selama Trias Akhir dan tinggal di Eropa. Fosil Eudimorphodon pertama ditemukan pada tahun 1973.",
            "- Ada dari 215,56 juta tahun yang lalu hingga Zaman Rhaetian\n" +
                    "- Tinggal di habitat laut\n" +
                    "- Adalah sebuah piscivore\n" +
                    "- Dapat terbang\n" +
                    "- 13 spesimen berbeda telah ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Efraasia",
            "https://images.dinosaurpictures.org/Efraasia_d172.jpg",
            "Efraasia adalah seorang herbivora. Ia hidup pada zaman Trias dan mendiami Eropa. Fosilnya telah ditemukan di tempat-tempat seperti Alsace (Prancis).",
            "- Sudah ada dari 228 juta tahun lalu menjadi 208,5 juta tahun lalu\n" +
                    "- Tinggal di habitat darat\n" +
                    "- 5 spesimen berbeda telah ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Antetonitrus",
            "https://images.dinosaurpictures.org/Antetonitrus-commander-salamander_dbf6.jpg",
            "Antetonitrus adalah herbivora. Ia hidup pada zaman Trias dan mendiami Afrika. Fosilnya telah ditemukan di tempat-tempat seperti Free State (RSA).",
            "- Ada dari Zaman Norian ke Zaman Rhaetian\n" +
                    "- Tinggal di habitat darat\n" +
                    "- Hanya satu spesimen yang ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Asylosaurus",
            "https://images.dinosaurpictures.org/Asylosaurus_yalensis_by_karkemish00_9538.jpg",
            "Asylosaurus adalah seorang herbivora / omnivora. Ia hidup pada zaman Trias dan mendiami Eropa. Fosilnya telah ditemukan di tempat-tempat seperti Inggris (Inggris).",
            "- Ada dari Zaman Rhaetian hingga 201,3 juta tahun yang lalu\n" +
                    "- Tinggal di habitat darat\n" +
                    "- Hanya satu spesimen yang ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Nyasasaurus",
            "https://images.dinosaurpictures.org/Nyasasaurus_NT_d5df.jpg",
            "Nyasasaurus adalah herbivora. Ia hidup pada zaman Trias dan mendiami Afrika. Fosilnya telah ditemukan di tempat-tempat seperti Njombe (Tanzania) dan Utara (Malawi).",
            "- Sudah ada dari 247,2 juta tahun yang lalu menjadi 242 juta tahun yang lalu\n" +
                    "- Tinggal di habitat darat\n" +
                    "- 2 spesimen berbeda telah ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Gojirasaurus",
            "https://images.dinosaurpictures.org/Gojirasaurus_20140502_7796.jpg",
            "Gojirasaurus adalah karnivora. Ia hidup pada zaman Trias dan mendiami Amerika Utara. Fosilnya telah ditemukan di tempat-tempat seperti Texas.",
            "- Ada dari Zaman Norian hingga 208,5 juta tahun yang lalu\n" +
                    "- Tinggal di habitat darat\n" +
                    "- Apakah karnivora\n" +
                    "- Diproduksi ulang dengan bertelur\n" +
                    "- Hanya satu spesimen yang ditemukan oleh ahli paleontologi"
        )
    )

    private var dinosaurJurassic = arrayOf(
        arrayOf(
            "Brachytrachelopan",
            "https:://images.dinosaurpictures.org/5-brachytrachelopan-walking-kostyantyn-ivanyshen_6916.jpg",
            "Brachytrachelopan adalah seorang herbivora. Ia hidup pada periode Jurassic dan menghuni Amerika Selatan. Fosilnya telah ditemukan di tempat-tempat seperti Argentina.",
            "- Sudah ada dari 152,1 juta tahun lalu hingga 145 juta tahun lalu\n" +
                    "- Tinggal di habitat darat\n" +
                    "- Apakah seorang herbivora\n" +
                    "- Diproduksi ulang dengan bertelur\n" +
                    "- Hanya satu spesimen yang ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Xiaosaurus",
            "https:://images.dinosaurpictures.org/xiaosaurus_839f.jpg",
            "Xiaosaurus adalah seorang herbivora. Ia hidup pada periode Jurassic dan mendiami Asia. Fosilnya telah ditemukan di tempat-tempat seperti Sichuan (Cina).",
            ""
        ),
        arrayOf(
            "Datousaurus",
            "https:://images.dinosaurpictures.org/datousaurus_web_3124.jpg",
            "Datousaurus adalah seorang herbivora. Ia hidup pada periode Jurassic dan mendiami Asia. Fosilnya telah ditemukan di tempat-tempat seperti Sichuan (Cina).",
            ""
        ),
        arrayOf(
            "Abrosaurus",
            "",
            "Abrosaurus adalah seorang herbivora. Ia hidup pada periode Jurassic dan mendiami Asia. Fosilnya telah ditemukan di tempat-tempat seperti Sichuan (Cina).",
            "- Ada dari Zaman Bajocian hingga Zaman Callovian\n" +
                    "- Tinggal di habitat darat\n" +
                    "- Apakah seorang herbivora\n" +
                    "- Diproduksi ulang dengan bertelur\n" +
                    "- Hanya satu spesimen yang ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Gnathosaurus",
            "https:://images.dinosaurpictures.org/Gnathosaurus_9ac8.jpg",
            "Gnathosaurus adalah pterosaurus, sejenis reptil terbang. Itu bukan dinosaurus, meskipun hidup pada periode yang sama. Gnathosaurus hidup selama Zaman Akhir dan tinggal di Eropa. Fosil Gnathosaurus pertama ditemukan pada tahun 1833.",
            "- Ada dari Zaman Berriasian hingga 139,8 juta tahun yang lalu\n" +
                    "- Tinggal di habitat laut\n" +
                    "- Adalah sebuah piscivore\n" +
                    "- Dapat terbang\n" +
                    "- Hanya satu spesimen yang ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Adeopapposaurus",
            "https:://images.dinosaurpictures.org/Adeopapposaurus-Brad-ysaurus_6eee.jpg",
            "Adeopapposaurus adalah herbivora. Ia hidup pada periode Jurassic dan menghuni Amerika Selatan. Fosilnya telah ditemukan di tempat-tempat seperti Argentina.",
            "- Ada dari Zaman Jurassic Bawah hingga 174,1 juta tahun yang lalu\n" +
                    "- Tinggal di habitat darat\n" +
                    "- 2 spesimen berbeda telah ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Chialingosaurus",
            "https:://images.dinosaurpictures.org/Chialingosaurus_3192.jpg",
            "Chialingosaurus adalah herbivora. Ia hidup pada periode Jurassic dan mendiami Asia.",
            "- Sudah ada dari 182,7 juta tahun lalu hingga 66 juta tahun lalu\n" +
                    "- Tinggal di habitat darat\n" +
                    "- Apakah seorang herbivora\n" +
                    "- Diproduksi ulang dengan bertelur\n" +
                    "- 232 spesimen berbeda telah ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Hesperosaurus",
            "https:://images.dinosaurpictures.org/Hesperosaurus_NT_f4e2.jpg",
            "Hesperosaurus adalah seorang herbivora. Ia hidup pada periode Jurassic dan menghuni Amerika Utara. Fosilnya telah ditemukan di tempat-tempat seperti Wyoming.",
            ""
        ),
        arrayOf(
            "Anurognathus",
            "https:://images.dinosaurpictures.org/anurognathus_c19a.jpg",
            "Anurognathus adalah pterosaurus, sejenis reptil terbang. Itu bukan dinosaurus, meskipun hidup pada periode yang sama. Anurognathus hidup selama Jurassic Akhir dan tinggal di Eropa. Fosil Anurognathus pertama ditemukan pada tahun 1923.",
            "- Ada dari Zaman Tithonian hingga 145 juta tahun yang lalu\n" +
                    "- Tinggal di habitat laut\n" +
                    "- Adalah sebuah piscivore\n" +
                    "- Dapat terbang\n" +
                    "- Hanya satu spesimen yang ditemukan oleh ahli paleontologi"
        ),
        arrayOf(
            "Hexinlusaurus",
            "https:://images.dinosaurpictures.org/Hexinlusaurus_bb71.jpg",
            "Hexinlusaurus adalah seorang herbivora. Ia hidup pada periode Jurassic dan mendiami Asia. Fosilnya telah ditemukan di tempat-tempat seperti Sichuan (Cina).",
            "- Ada sejak 170,3 juta tahun yang lalu hingga Zaman Callovian\n" +
                    "- Tinggal di habitat darat\n" +
                    "- Apakah seorang herbivora\n" +
                    "- Diproduksi ulang dengan bertelur\n" +
                    "- Hanya satu spesimen yang ditemukan oleh ahli paleontologi"
        )
    )

    val listDinosaurTriassic: ArrayList<DinosaurModel>
        get() {
            val listDinosaur = ArrayList<DinosaurModel>()
            for (dinosaur in dinosaurTriassic){
                val dinosaurModel = DinosaurModel()
                dinosaurModel.name = dinosaur[0]
                dinosaurModel.image = dinosaur[1]
                dinosaurModel.shortDescryption = dinosaur[2]
                dinosaurModel.quictFacts = dinosaur[3]

                listDinosaur.add(dinosaurModel)
            }
            return listDinosaur
        }

    val listDinosaurJurassic: ArrayList<DinosaurModel>
        get() {
            val listDinosaur = ArrayList<DinosaurModel>()
            for (dinosaur in dinosaurJurassic){
                val dinosaurModel = DinosaurModel()
                dinosaurModel.name = dinosaur[0]
                dinosaurModel.image = dinosaur[1]
                dinosaurModel.shortDescryption = dinosaur[2]
                dinosaurModel.quictFacts = dinosaur[3]

                listDinosaur.add(dinosaurModel)
            }
            return listDinosaur
        }
}
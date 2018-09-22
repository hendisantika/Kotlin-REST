package com.hendisantika.kotlin

import com.hendisantika.kotlin.domain.Status
import org.hibernate.annotations.GenericGenerator
import java.io.Serializable
import java.util.*
import javax.persistence.*


/*

  @author hendisantika
  Created on Jan 19, 2017
*/

@Entity
@Table(name = "tb_problem")
class Problem : Serializable {

    @Id
    @Column(name = "id_problem", length = 150)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    var idProblem: String? = null

    @Column(name = "judul", length = 50)
    var judul: String? = null

    @Lob
    @Column(name = "deskripsi")
    var deskripsi: String? = null

    @Column(name = "status", length = 10)
    @Enumerated(EnumType.STRING)
    var status: Status = Status.belum

    @Column(name = "tanggalProblem")
    @Temporal(TemporalType.TIMESTAMP)
    var tanggalProble: Date = Date()

}
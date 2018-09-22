package com.hendisantika.kotlin.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.GenericGenerator
import java.io.Serializable
import javax.persistence.*


/*

  @author hendisantika
  Created on Jan 19, 2017
*/

@Entity
@Table(name = "tb_user_role")
class UserRole : Serializable {

    @Id
    @Column(name = "id_user_role", length = 150)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    var idUserRole: String? = null

    @Column(name = "role", length = 10)
    var role: String? = null

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.ALL))
    @JoinColumn(name = "email", nullable = false, foreignKey = ForeignKey(ConstraintMode.CONSTRAINT))
    var user = User()
}
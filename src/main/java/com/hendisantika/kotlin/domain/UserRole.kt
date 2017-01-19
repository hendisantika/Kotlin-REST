package com.hendisantika.kotlin.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.GenericGenerator
import java.io.Serializable
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.ConstraintMode
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.ForeignKey
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table


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
package com.example.myapp.entity



import org.apache.tomcat.jni.Local
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "boards")
class Board(
    var boardTitle: String,
    var boardMain: String,
    val createdAt: Date?,
    var updatedAt: Date?,
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "userId")
    val user: User,
    ) {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    val boardId: Int = 0
}
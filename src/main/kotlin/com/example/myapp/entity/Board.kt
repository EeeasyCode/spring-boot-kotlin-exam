package com.example.myapp.entity

import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
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
    @JoinColumn(name = "user_id")
    val user: User
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val boardId: Int = 0
}

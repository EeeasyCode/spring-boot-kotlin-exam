package com.example.myapp.entity

import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "comments")
class Comment(
    val commentUser: String,
    var commentContent: String,
    val createdAt: Date?,

    @ManyToOne
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name="board_id")
  val board: Board,

    @ManyToOne
  @JoinColumn(name = "user_id")
  val user: User

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val commentId: Int = 0
}
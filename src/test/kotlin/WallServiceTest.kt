import ad.resume.Post
import ad.resume.PostNotFoundException
import ad.resume.Comment
import org.junit.Before
import ad.resume.WallService
import org.junit.Assert.*

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @org.junit.Test
    fun createComment() {
        val post = Post()
        val newPost = WallService.add(post)
        val comment = Comment()
        val result = WallService.createComment(newPost.id, comment)
        assertEquals(comment, result)
    }

    @org.junit.Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val comment = Comment()
        WallService.createComment(99,comment)
    }
    
    @org.junit.Test
    fun add() {

        val post = Post()
        val newPost = WallService.add(post)
        assertNotEquals(0, newPost.id)
    }

    @org.junit.Test
    fun updateTrue() {

        val post = Post()
        val newPost = WallService.add(post)
        val updPost = newPost.copy(text = "Update test test!")
        val result = WallService.update(updPost)
        assertTrue(result)

    }

    @org.junit.Test
    fun updateFalse() {
        val post = Post(id = 999)
        val result = WallService.update(post)
        assertFalse(result)
    }

}
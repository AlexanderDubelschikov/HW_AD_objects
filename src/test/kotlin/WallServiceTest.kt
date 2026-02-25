import ad.resume.Post
import org.junit.Before
import ad.resume.WallService
import org.junit.Assert.*

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
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
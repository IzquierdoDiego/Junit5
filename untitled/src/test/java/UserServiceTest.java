import org.fractal.UserDto;
import org.fractal.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    private UserService userService;

    @BeforeEach  // crate execute method ebefore all others method

    public void setUp(){
        userService = new UserService();
        userService.createUser(0L, "Diego");
        userService.createUser(2L, "Diego2");

    }

    @DisplayName("given an user we want to create, we expected it be the same to other created") // explain test
    @Test
    public void test1() {
        UserDto expected = new UserDto(1L, "Diego");
        //UserService userService = new UserService();
        final UserDto result = userService.createUser(1L, "Diego");
        //Assertions.assertEquals(expected, result);
        Assertions.assertEquals(expected.getId(), result.getId());
        Assertions.assertEquals(expected.getNombre(), result.getNombre());
    }

    @Test
    public void test2() {
        UserDto expected = new UserDto(1L, "Diego");
        //UserService userService = new UserService();
        final UserDto result = userService.createUser(1L, "Diego0");
        //Assertions.assertEquals(expected, result);
        Assertions.assertEquals(expected.getId(), result.getId());
        Assertions.assertNotEquals(expected.getNombre(), result.getNombre());
    }

    @DisplayName("test if user exist") // explain test
    @Test
    public void test3() {
        UserDto expected = new UserDto(1L, "Diego");
        //UserService userService = new UserService();
        final UserDto result = userService.getUser(1L);

        Assertions.assertNull(result);
        Assertions.assertEquals(null, result);
    }

    @Test
    public void test4() {f
        UserDto expected = new UserDto(0L, "Diego");
        //UserService userService = new UserService();

        final UserDto result = userService.getUser(0L);
        Assertions.assertEquals(expected, result);
    }

}

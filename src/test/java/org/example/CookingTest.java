package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking(); //요리사에게 요리사 객체를 만들고
        MenuItem menuItem = new MenuItem("돈까스",5000); // 요리를 만든다음에

        Cook cook = cooking.makeCook(menuItem); //요리사에게 요리를 만들어 달라는 요청을 한다. (메뉴를 보고 요리를 해준다.)

        assertThatCode(()-> new Cook("돈까스",5000)) //돈까스에 해당하는 요리가 맞나요 ?
                .doesNotThrowAnyException();
    }
}

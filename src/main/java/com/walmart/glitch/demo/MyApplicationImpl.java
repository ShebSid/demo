package com.walmart.glitch.demo;

import com.walmart.glitch.demo.myapi.UserApiDelegate;
import com.walmart.glitch.demo.mymodel.User;
/*import io.reflectoring.myapi.UserApiDelegate;
import io.reflectoring.mymodel.User;*/
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class MyApplicationImpl implements UserApiDelegate {

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        User user = new User();

        user.setId(123L);
        user.setFirstName("Petros");
        user.setLastName("S");
        user.setUsername("Petros");
        user.setEmail("petors.stergioulas94@gmail.com");
        user.setPassword("secret");
        user.setPhone("+123 4567890");
        user.setUserStatus(0);

        return ResponseEntity.ok(user);
    }

   /* @Override
    public ResponseEntity<SuccessResponse> getReceivingsInfo1(String countryCode,
                                                              Integer vendorNumber,
                                                              Integer purchaseOrderId,
                                                              String lineFlag) {
        User user = new User();

        user.setId(123L);
        user.setFirstName("Petros");
        user.setLastName("S");
        user.setUsername("Petros");
        user.setEmail("petors.stergioulas94@gmail.com");
        user.setPassword("secret");
        user.setPhone("+123 4567890");
        user.setUserStatus(0);

        SuccessResponse successResponse = new SuccessResponse();
        successResponse.setData(Collections.singletonList(user));

        return ResponseEntity.ok(successResponse);
    }*/
}


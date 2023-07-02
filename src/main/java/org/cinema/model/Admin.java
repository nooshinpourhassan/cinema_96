package org.cinema.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder

class Admin {
    private Long id;
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String password;

    public void admin() {

    }

}

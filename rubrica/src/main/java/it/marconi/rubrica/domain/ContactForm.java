package it.marconi.rubrica.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// la classe ContactForm supporta il form di inserimento dati
// ci servirà come contenitore per passare i parametri via Model
// e per introdurre controlli di validazione sulle text input

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactForm {
    
    // inserisco i controlli di validazione per ogni campo (causa di @Valid)

    @NotEmpty
    @Size(max = 30)
    private String name;

    @NotEmpty
    @Size(max = 50) 
    private String surname;

    @Pattern(regexp = "([0-9]{10})")
    private String phone;

    @Email
    private String email;
}

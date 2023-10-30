Feature: Testing sg-quote UI validators

  Background: Open sg-quote main page
    Given Open page "https://allianz-sg-quote-dev.azcare.allianz.com/index.html"

  Rule: Field 'first name' is allowed only English characters and single quote or dash in other case component should be in invalid state
    Example: With invalid value component should be in invalid state and test should be passed
      When To field "firstName" enter value "" component should be in invalid state
      When To field "firstName" enter value "жщз" component should be in invalid state
      When To field "firstName" enter value "123" component should be in invalid state
      When To field "firstName" enter value "Mary send to test@mail.com" component should be in invalid state
      When To field "firstName" enter value "Mary-Kate call to +380101235566" component should be in invalid state
      When To field "firstName" enter value "O'Connell send to card 2344 2342 1233 4234" component should be in invalid state

  Rule: Field 'email' is allowed email pattern, for example - john.dou_%-+123@example.co.uk, in other case component should be in invalid state
    Example: With invalid value component should be in invalid state and test should be passed
      When To field "email" enter value "" component should be in invalid state
      When To field "email" enter value "афыафвжщз@ыафыаю.аыфа" component should be in invalid state
      When To field "email" enter value "123" component should be in invalid state
#      need to fix - must not pass whitespace in the field
#      When To field "email" enter value "Mary send to test@mail.com" component should be in invalid state
      When To field "email" enter value "Mary-Kate call to +380101235566" component should be in invalid state
      When To field "email" enter value "O'Connell send to card 2344 2342 1233 4234" component should be in invalid state


  Rule: Field 'email' [one input per rule] is allowed email pattern, for example - john.dou_%-+123@example.co.uk, in other case component should be in invalid state
    Example: With invalid value component should be in invalid state and test should be passed
      When To field "email" enter value "афыафвжщз@ыафыаю.аыфа" component should be in invalid state

  Rule: Field 'email' [one input per rule(failing case)] is allowed email pattern, for example - john.dou_%-+123@example.co.uk, in other case component should be in invalid state
    Example: With invalid value component should be in invalid state and test should be passed
      #      need to fix - must not pass whitespace in the field
      When To field "email" enter value "Mary send to test@mail.com" component should be in invalid state

  Rule: Field 'email' [one input per rule] is allowed email pattern, for example - john.dou_%-+123@example.co.uk, in other case component should be in invalid state
    Example: With invalid value component should be in invalid state and test should be passed
      When To field "email" enter value "O'Connell send to card 2344 2342 1233 4234" component should be in invalid state
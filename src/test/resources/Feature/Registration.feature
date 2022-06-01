Feature: Verify the registration with different kind of data

  Scenario Outline: Verify the registration for the daily planner screen
    Given lanuch the Application
    When User should tap the enter button
    When User should tap the register button in login screen
    And user should enter the "<Firstname>","<LastName>","<UserName>","<Password>" and "<Email Id>"
    Then user should navigate the register screen sucessfull

    Examples: 
      | Firstname  | LastName  | UserName       | Password    | Email Id            |
      | Kathir     | Velan     | Kathir_123     | Kathir@12   | Kathir@gmail.com    |
      | Kathir     | K         | Kathir_12      | Kathir!12   | Kathir2@gmail.com   |
      | Kathir     | V         | K_a_t_h_i_r12  | @Kathir21   | Kathir3@gmail.com   |
      | Kumaran    | P         | _Kumar_2121    | Ku$maran12  | Kumar@gmail.com     |
      | Ifran      | M         | IfranMohammed  | I*fran@121  | Kathir@gmail.com    |
      | Prasanna   | Vela      | Prasa__423     | $Prasanna$1 | P.V@gmail.com       |
      | Velmurugan | Thngarasu | Vel_23_Thangam | ^Vel^123    | Vel.S1@gmail.com    |
      | indra      | J         | jo_shi_13336   | @Joshi#12   | @in.d@gmail.com     |
      | Sukrit     | Naruky    | Su_kr143       | @Small345#@ | Indra----@gmail.com |
      | Saravanan  | S         | Saravan456     | !Saravan90  | Saran@gmail.com     |

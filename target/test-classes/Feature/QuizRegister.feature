Feature: Verify the quiz app registration

  Scenario Outline: Verify the quiz app registration with different data
    Given user lanuch the quiz app
    When User tap the register button
    And User enter the data in register page "<FirstName>","<LastName>","<Username>","<Password>","<Email address>" and click register button
    Then the sucess alert displayed in the registration screen

    Examples: 
      | FirstName         | LastName       | Username             | Password    | Email address       |
      | Ganesh            | BijoyAlia      | GaneshBijyAlia2      | 56*@Aliaa   | 12.3534@co.in       |
      | AadishNaresh      | Sankar         | SankarGanesh1        | !sanAr73*#  | 45f.ag54.q@jo.in    |
      | LaveenaRadheshyam | Hans           | RupalLalitHans0      | ramp#@$7P   | .112sd@su.in        |
      | Jasmin            | VenkatMisra    | Indrani4             | 124indu56#P | i.nd@hotmail.com    |
      | Komal             | Sura           | Sukriti              | Sukriti126^ | suk.123@yahoo.com   |
      | Jobin             | Ram Mall       | Rambosidha123        | RAMa@!234   | once12@big.in       |
      | RadheDev          | Varughese      | Wolksradhe           | wolk69@#$L  | wolk@rise.com       |
      | Tulsi             | Gola           | WolksradheGola       | !GOLA123o$  | wolk@gmail.com      |
      | Mohan             | Ram            | MohanRam             | Mo0han!#    | wolk@gmail.in       |
      | RamGopal          | PratapKunda    | PratapKundaRamGopal  | 00000Oo$    | wolk@gmail.rise     |
      | Ibrahim           | Gaba           | Gabaa                | PPPPPp!!^1  | rise@wolk.com       |
      | Sabina            | MohanlalPingle | PratapKundaRamGopalq | Ram#$1234   | 12wolk@gmail.com    |
      | Chandni           | Nori           | NOORI                | NOOORI1i!#  | chan.da@outlook.com |
      | Ricky             | Salvi          |    77889966554433200 | SalVIGhI!%1 | oops@gmail.com      |
      | Ricky             | Salvi          |               885745 | 111!%!11AAa | runner123@gmail.in  |
      | RupalLalit        | Rampersad      | rupaLALITw           | ruPa45*^-   | pa.ssd@gmail.in     |

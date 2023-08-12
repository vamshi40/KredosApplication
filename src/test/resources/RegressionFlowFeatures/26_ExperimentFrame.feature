Feature: Experiment Frame

  Scenario Outline: Validating the ExperimentFrame Module Functionality

    Given Login to Kredos Application with <Username> and <Password>
    And Click on the MessageBuilder button
    And Enter a <message> in ExperimentFrame
    And Click on ImageLibrary and select Image
    And Click on MessageMechanics and select Tags <tags1> <tags2> <tags3>
    And Click on Target Dropdown and select Targets <targets1>
    And Create Duplicate Message and Verify with original <message>
    And Click on Timings button and enter the <risklevel>
    And Clicking on the Notes button and Entering the <text>
    And Clicking on the Add button and Creating Duplicate Macro
    And Delete the Created Macro
    And Click on save button
    And Click on canvas button
    And Click on submit button

    Examples:
      | Username    | Password     | message   | tags1                                                           | tags2                                                                                                                                                                                                                                                          | tags3                                    | targets1                                            | risklevel           | text            |
      | "shivateja" | "shiva@2001" | "testing" | "Kernel(#1),Loss Framing,Early-Mid,QWERTY,Static image,Spanish" | " Learn Yes, Continue No, Join Yes, Offer No, Service Yes, Pay No,Social affirmation:Yes,Social comparison:No,Social conformity:Yes,Social reciprocation:No,Availability heuristic:Yes,Anchoring & adjustment::No,Representativeness:Yes,Baserate neglect::No" | "Formality:Low,Emotions:Low,Urgency:Mid" | "RISK LEVEL ,BEHAVIOUR SCORE ,CREDIT CLASS ,STATE " | "1-DPD 11,2-DPD 17" | "testing notes" |

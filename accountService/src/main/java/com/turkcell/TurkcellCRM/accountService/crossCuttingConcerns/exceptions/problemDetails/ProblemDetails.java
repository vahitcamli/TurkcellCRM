package com.turkcell.TurkcellCRM.accountService.crossCuttingConcerns.exceptions.problemDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ProblemDetails {

    private String title;
    private String detail;
    private String Status;
    private String Type;
}
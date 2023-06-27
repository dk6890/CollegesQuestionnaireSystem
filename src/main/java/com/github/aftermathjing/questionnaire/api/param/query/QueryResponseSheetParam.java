package com.github.aftermathjing.questionnaire.api.param.query;

import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
public class QueryResponseSheetParam {
    String projectId;

    String username;
}

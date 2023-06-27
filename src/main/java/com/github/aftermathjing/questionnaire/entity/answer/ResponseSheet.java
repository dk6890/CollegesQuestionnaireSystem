package com.github.aftermathjing.questionnaire.entity.answer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;

/**
 * 答题卡实体类
 *
 * @author aftermarhjing
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
public class ResponseSheet {

    /**
     * 答卷ID
     */
    String id;
    /**
     * 问卷ID
     */
    String qnnreId;
    /**
     * 问卷名称
     */
    String qnnreName;
    /**
     * 答卷人ID
     */
    String respondentId;
    /**
     * 答卷人姓名
     */
    String respondentName;
    /**
     * 答题时间
     */
    Date finishedTime;
}
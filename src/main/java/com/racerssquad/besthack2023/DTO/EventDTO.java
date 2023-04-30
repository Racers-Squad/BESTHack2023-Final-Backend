package com.racerssquad.besthack2023.DTO;

import java.util.List;

public record EventDTO(String caption, List<FieldInfo> fields, boolean fullOrIncrement, List<DataRowInfo> rows) {
}

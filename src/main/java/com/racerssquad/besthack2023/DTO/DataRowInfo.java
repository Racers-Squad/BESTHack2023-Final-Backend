package com.racerssquad.besthack2023.DTO;

import java.util.List;

public record DataRowInfo(int id, boolean incrementDelete, List<DataValueInfo> values) {
}

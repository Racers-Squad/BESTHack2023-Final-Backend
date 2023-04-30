package com.racerssquad.besthack2023.DTO;

import java.util.List;

public record CommandResponse (int id, String caption, String description, List<ParameterResponse> params){
}

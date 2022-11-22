package br.com.dicasdeumdev.api.resources.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class StandardError {
    private LocalDateTime timeStanp;
    private Integer status;
    private String error;
    private String path;
}

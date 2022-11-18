package br.com.dicasdeumdev.api.resources.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class StandardError {
    private LocalDateTime timeStanp;
    private Integer status;
    private String errot;
    private String path;
}
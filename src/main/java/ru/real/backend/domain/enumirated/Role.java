package ru.real.backend.domain.enumirated;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    USER,
    ADMIN
}
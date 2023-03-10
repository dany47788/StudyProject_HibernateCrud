package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.WriterCreateDto;
import org.example.dto.WriterReadDto;
import org.example.service.WriterService;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class WriterController {

    private final WriterService writerService;

    public List<WriterReadDto> findAll() {
        return writerService.findAll();
    }

    public Optional<WriterReadDto> findById(Long id) {
        return writerService.findById(id);
    }

    public void create(WriterCreateDto writerCreateDto) {
        writerService.create(writerCreateDto);
    }

    public void update(WriterReadDto writerReadDto) {
        writerService.update(writerReadDto);
    }

    public void deleteById(Long id) {
        writerService.deleteById(id);
    }
}

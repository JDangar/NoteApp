package com.app.noteapp.feature.note.domain.usecase

import com.app.noteapp.feature.note.domain.model.Note
import com.app.noteapp.feature.note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}
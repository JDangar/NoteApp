package com.app.noteapp.feature.note.domain.usecase

import com.app.noteapp.feature.note.domain.model.Note
import com.app.noteapp.feature.note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}
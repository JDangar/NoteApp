package com.app.noteapp.feature.note.domain.usecase

import com.app.noteapp.feature.note.domain.model.InvalidNoteException
import com.app.noteapp.feature.note.domain.model.Note
import com.app.noteapp.feature.note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val noteRepository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isBlank()){
            throw InvalidNoteException("The title of the Note can't be empty.")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("The content of the Note can't be empty.")
        }
        noteRepository.insertNote(note)
    }
}
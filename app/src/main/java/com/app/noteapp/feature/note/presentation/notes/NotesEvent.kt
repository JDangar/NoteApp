package com.app.noteapp.feature.note.presentation.notes

import com.app.noteapp.feature.note.domain.model.Note
import com.app.noteapp.feature.note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteOrder(val note: Note): NotesEvent()
    data object RestoreNote: NotesEvent()
    data object ToggleOrderSection: NotesEvent()
}
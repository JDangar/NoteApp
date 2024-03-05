package com.app.noteapp.feature.note.presentation.notes

import com.app.noteapp.feature.note.domain.model.Note
import com.app.noteapp.feature.note.domain.util.NoteOrder
import com.app.noteapp.feature.note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

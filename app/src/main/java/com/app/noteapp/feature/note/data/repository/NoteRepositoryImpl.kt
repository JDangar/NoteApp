package com.app.noteapp.feature.note.data.repository

import com.app.noteapp.feature.note.data.source.NoteDao
import com.app.noteapp.feature.note.domain.model.Note
import com.app.noteapp.feature.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteDao: NoteDao
): NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
       return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}
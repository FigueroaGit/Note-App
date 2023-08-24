package com.figueroa.noteapp.data

import com.figueroa.noteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Example 1", description = "This is an example of description of notes"),
            Note(title = "Example 2", description = "This is an example of description of notes"),
            Note(title = "Example 3", description = "This is an example of description of notes"),
            Note(title = "Example 4", description = "This is an example of description of notes"),
            Note(title = "Example 5", description = "This is an example of description of notes"),
            Note(title = "Example 6", description = "This is an example of description of notes"),
            Note(title = "Example 7", description = "This is an example of description of notes"),
        )
    }
}
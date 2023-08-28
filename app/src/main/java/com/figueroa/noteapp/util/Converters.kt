package com.figueroa.noteapp.util

import androidx.room.TypeConverter
import java.util.Date
import java.util.UUID

class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun uuidToString(string: String): UUID? {
        return UUID.fromString(string)
    }

    @TypeConverter
    fun fromUUID(uuid: UUID): String? {
        return uuid.toString()
    }
}
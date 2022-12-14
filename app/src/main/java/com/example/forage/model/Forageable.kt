/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.forage.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Forageable entity to be stored in the forageable_database.
 */
// TODO: annotate this data class as an entity with a parameter for the table name
@Entity(tableName = "forageable_database")
data class Forageable(
    // TODO: declare the id to be an autogenerated primary key
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val address: String,
    // TODO: make a custom column name for the inSeason variable that follows SQL column name
    //  conventions (the column name should be in_season)
    @NonNull @ColumnInfo(name="in_season")
    val inSeason: Boolean,
    val notes: String?
)

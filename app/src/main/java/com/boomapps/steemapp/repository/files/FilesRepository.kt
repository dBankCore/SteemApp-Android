/*
 * Copyright 2018, BoomApps LLC. 
 * All rights reserved.
*/
package com.boomapps.steemapp.repository.files

/**
 * Created by vgrechikha on 21.03.2018.
 */
interface FilesRepository {

    interface StoryCallback {

        fun onSaveStory()

        fun onClearStory()

        fun onLoadStory(story : String, stylesState: ArrayList<HashMap<String, Boolean>>)

        fun onError()
    }

    fun saveStory(value: String, stylesState: ArrayList<HashMap<String, Boolean>>, storyCallback: StoryCallback?)

    fun clearStory(storyCallback: StoryCallback?)

    fun loadStory(storyCallback: StoryCallback)

}
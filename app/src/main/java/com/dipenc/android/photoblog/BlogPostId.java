package com.dipenc.android.photoblog;

/**
 * Created by Sangeeta on 19-04-2018.
 */
import android.support.annotation.NonNull;

import com.google.firebase.firestore.Exclude;

public class BlogPostId {

    @Exclude
    public String BlogPostId;

    public <T extends BlogPostId> T withId(@NonNull final String id) {
        this.BlogPostId = id;
        return (T) this;
    }

}
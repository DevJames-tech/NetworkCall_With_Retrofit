package com.example.debugsandbox;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeroAlbum {


        @Expose
        @SerializedName("albumId")
        private Long mAlbumId;
        @SerializedName("id")
        private Long mId;
        @SerializedName("thumbnailUrl")
        private String mThumbnailUrl;
        @SerializedName("title")
        private String mTitle;
        @SerializedName("url")
        private String mUrl;

        public Long getAlbumId() {
            return mAlbumId;
        }

        public void setAlbumId(Long albumId) {
            mAlbumId = albumId;
        }

        public Long getId() {
            return mId;
        }

        public void setId(Long id) {
            mId = id;
        }

        public String getThumbnailUrl() {
            return mThumbnailUrl;
        }

        public void setThumbnailUrl(String thumbnailUrl) {
            mThumbnailUrl = thumbnailUrl;
        }

        public String getTitle() {
            return mTitle;
        }

        public void setTitle(String title) {
            mTitle = title;
        }

        public String getUrl() {
            return mUrl;
        }

        public void setUrl(String url) {
            mUrl = url;
        }

    }

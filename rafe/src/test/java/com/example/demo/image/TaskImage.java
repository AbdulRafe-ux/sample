package com.example.demo.image;

public class TaskImage {
    private Long taskId;
    private String imageUrl;

    public TaskImage() {}

    public TaskImage(Long taskId, String imageUrl) {
        this.taskId = taskId;
        this.imageUrl = imageUrl;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

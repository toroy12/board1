package study.kim.board.dto;


import study.kim.board.domain.entity.File;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class FileDto {
    private Long id;
    private String filePath;
    private String filename;
    private String origFilename;

    public File toEntity() {
        File build = File.builder()
                .id(id)
                .filePath(filePath)
                .filename(filename)
                .origFilename(origFilename)
                .build();
        return build;
    }

    @Builder
    public FileDto(Long id, String filePath, String filename, String origFilename) {
        this.id = id;
        this.filePath = filePath;
        this.filename = filename;
        this.origFilename = origFilename;
    }
}
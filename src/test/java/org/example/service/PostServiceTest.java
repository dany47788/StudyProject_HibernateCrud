package org.example.service;

/*

@ExtendWith(MockitoExtension.class)
class PostServiceTest {

    private LabelDtoMapper labelDtoMapper;
    private LabelMapper labelMapper;
    private PostDtoMapper postDtoMapper;
    private PostMapper postMapper;
    @Mock
    private PostRepositoryImpl postRepository;
    @Mock
    private LabelRepositoryImpl labelRepository;
    private PostService postService;

    @BeforeEach
    void init() {
        labelDtoMapper = new LabelDtoMapper();
        labelMapper = new LabelMapper();
        postDtoMapper = new PostDtoMapper(labelDtoMapper);
        postMapper = new PostMapper(labelMapper);

        labelDtoMapper.setPostDtoMapper(postDtoMapper);
        labelMapper.setPostMapper(postMapper);

        postService = new PostService(
            postRepository, labelRepository, labelDtoMapper, postDtoMapper, postMapper);
    }

    @Test
    void update() {
        var inputDto = new PostDto(1, 1, LocalDateTime.now(),
            LocalDateTime.now(), "test", PostStatus.ACTIVE);

        given(postRepository.update(postMapper.map(inputDto)))//check that the service input sent to the repo unchanged
            .willReturn(postMapper.map(inputDto));

        var returnedDto = postService.update(inputDto);

        assertEquals(inputDto, returnedDto);//check that the returned object equal input object
    }

    @Test
    void update_null() {
        assertThrows(NullPointerException.class, () -> postService.update(null));
    }

    @Test
    void create() {
        var labels = new ArrayList<LabelDto>();
        for (int i = 1; i < 4; i++) {
            labels.add(new LabelDto(i, "test" + i));
        }

        var inputDto = PostDto.builder()
            .writerId(1)
            .created(LocalDateTime.now())
            .updated(LocalDateTime.now())
            .content("test")
            .postStatus(PostStatus.ACTIVE)
            .labels(labels)
            .build();

        var extendedResult = PostDto.builder()
            .id(1)
            .writerId(inputDto.getWriterId())
            .created(inputDto.getCreated())
            .updated(inputDto.getUpdated())
            .content(inputDto.getContent())
            .postStatus(inputDto.getPostStatus())
            .labels(labels)
            .build();

        given(postRepository.create(postMapper.map(inputDto))).willReturn(postMapper.map(extendedResult));

        var result = postService.create(inputDto);

        assertEquals(extendedResult.getCreated(), result.getCreated());
        assertEquals(extendedResult.getUpdated(), result.getUpdated());
        assertEquals(extendedResult.getContent(), result.getContent());
        assertEquals(extendedResult.getWriterId(), result.getWriterId());
        assertEquals(extendedResult.getPostStatus(), result.getPostStatus());
        assertEquals(extendedResult.getLabels(), result.getLabels());
        assertNotNull(result.getId());
    }

    @Test
    void create_null() {
        assertThrows(NullPointerException.class, () -> postService.update(null));
    }

    @Test
    void delete() {
        assertDoesNotThrow(() -> postService.deleteById(any(Integer.class)));
    }

    @Test
    void testFindAll() {
        var posts = new ArrayList<Post>();

        for (int i = 1; i < 4; i++) {
            posts.add(new Post(i, i, LocalDateTime.now(), LocalDateTime.now(), "test" + i, PostStatus.ACTIVE));
        }
        given(postRepository.findAll()).willReturn(posts);

        var result = postService.findAll();

        assertEquals(posts.stream().map(postDtoMapper::map).toList(), result);
    }

    @Test
    void testIFindById_Found() {
        var expectedResult = new PostDto(1, 1, LocalDateTime.now(), LocalDateTime.now(), "test", PostStatus.ACTIVE);
        var expectedLabels = new ArrayList<LabelDto>();

        for (int i = 1; i < 4; i++) {
            expectedLabels.add(new LabelDto(i, "test1" + i));
        }

        given(postRepository.findById(any(Long.class))).willReturn(postMapper.map(expectedResult));

        given(labelRepository.findAllByPostId(any(Long.class))).willReturn(expectedLabels.stream()
            .map(labelMapper::map)
            .toList());

        expectedResult.setLabels(expectedLabels);

        var result = postService.findById(any(Long.class));

        Assertions.assertEquals(expectedResult.getId(), result.getId());
        Assertions.assertEquals(expectedResult.getWriterId(), result.getWriterId());
        Assertions.assertEquals(expectedResult.getLabels(), result.getLabels());
        Assertions.assertEquals(expectedResult.getPostStatus(), result.getPostStatus());
        Assertions.assertEquals(expectedResult.getCreated(), result.getCreated());
        Assertions.assertEquals(expectedResult.getUpdated(), result.getUpdated());
        Assertions.assertEquals(expectedResult.getContent(), result.getContent());
    }

    @Test
    void testFindById_NotFound() {
        given(postRepository.findById(any(Integer.class))).willThrow(NotFoundException.class);

        assertThrows(NotFoundException.class, () -> postService.findById(any(Integer.class)));
    }

    @Test
    void testFindById_Null() {
        var result = postService.findById(null);

        assertNull(result);
    }
}*/

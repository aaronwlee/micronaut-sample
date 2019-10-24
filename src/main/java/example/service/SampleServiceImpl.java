package example.service;

import java.util.ArrayList;
import java.util.List;

import example.model.response.Sample;

public class SampleServiceImpl implements SampleService {

    @Override
    public List<Sample> getSampleList() {
        List<Sample> sampleList = new ArrayList<Sample>();
        sampleList.add(new Sample("Aaron", 24));
        sampleList.add(new Sample("Jun", 25));
        sampleList.add(new Sample("Tony", 35));
        sampleList.add(new Sample("Eric", 30));
        sampleList.add(new Sample("Ivan", 36));
        return sampleList;
    }
}
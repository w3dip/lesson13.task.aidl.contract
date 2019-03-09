// IRemoteDataService.aidl
package ru.sberbank.lesson13.task.aidl.contract;

import ru.sberbank.lesson13.task.aidl.contract.Data;

interface IRemoteDataService {
    void write(in Data data);
    Data read();
}

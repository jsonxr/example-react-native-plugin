/* eslint-disable react-native/no-inline-styles */
import RTNExample from '@example/react-native/js/NativeExample';
import { useState } from 'react';
import { Button, SafeAreaView, StatusBar, Text } from 'react-native';

const App: () => JSX.Element = () => {
  const [result, setResult] = useState<number | null>(null);
  return (
    <SafeAreaView>
      <StatusBar barStyle={'dark-content'} />
      <Text style={{ marginLeft: 20, marginTop: 20 }}>
        3+7={result ?? '??'}
      </Text>
      <Button
        title="Compute"
        onPress={async () => {
          try {
            const value = await RTNExample?.add(3, 7);
            setResult(value ?? null);
          } catch (err) {
            if (err instanceof Error) {
              console.log(err.message);
            }
          }
        }}
      />
    </SafeAreaView>
  );
};
export default App;
